package com.totoro.behavioral.commandpattern.example2;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class DanceCommand implements Command{

    private BingBingReceiver bingBing;

    public DanceCommand(BingBingReceiver bingBing){
        this.bingBing = bingBing;
    }

    @Override
    public void execute() {
        bingBing.singSong();
    }
}
