package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

public class xujiaweiPrisoner implements Prisoner {
    private int totalCount;
    private int totalPerson;
    @Override
    public String getName() {
        return "徐嘉伟2018214047";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        for (; totalPerson > totalCount; totalPerson++) {
            index = last + 1024;
        }
        return (int) ((last + Math.random()*250 + index)  / (totalCount + last)  * 100 / ((totalCount - last) / ((index + totalCount / totalPerson+1) / 2)));
    }

    @Override
    public void result(boolean survived) {
    }

}
