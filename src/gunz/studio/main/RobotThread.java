package gunz.studio.main;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.LinkedList;

public class RobotThread extends Thread {

    public Robot robot;

    public RobotThread(){
        try {
            this.robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void run(){
        Command currentCommand = getNextCommand();
        while(currentCommand.getType() != CommandType.KILL){
            // Process the command no sleep...
            // ...
            // ...

            currentCommand = getNextCommand();
        }

        System.out.println("DIED ");
    }

    private LinkedList<Command> commands = new LinkedList<Command>();

    enum CommandType {
        KILL,
        DO_SOMETHING
    }

    private synchronized Command getNextCommand() {
        while(commands.isEmpty()) {
            try {
                System.out.println("WAITING");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return commands.removeFirst();
    }

    public synchronized void pushCommand(Command comm) {
        commands.addLast(comm);
        notify();
    }

    public synchronized void shutdown(){
        commands.clear();
        pushCommand(new Command(CommandType.KILL));
        System.out.println("shutdown");
        //Set<Thread> threadSet = Thread.getAllStackTraces().keySet(); Thread[] threadArray = threadSet.toArray(new Thread[threadSet.size()]); for (int i = 0; i < threadArray.length; i++) { System.out.println("End " + threadArray[i].getName()); }
    }  

    class Command {
        private CommandType cmdType;
        public Command(CommandType type) {
            this.cmdType = type;
        }
        public CommandType getType() { return cmdType; }
    }
}

