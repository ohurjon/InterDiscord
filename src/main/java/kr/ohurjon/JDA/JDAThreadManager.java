package kr.ohurjon.JDA;

import kr.ohurjon.JDA.JDAThread;

import java.util.ArrayList;

public class JDAThreadManager {
    public static ArrayList<JDAThread> JDAThreads = new ArrayList<>();

    public static ArrayList<JDAThread> getThreads(){
        return JDAThreads;
    }

    static void addThreads(JDAThread Thread){
        JDAThreads.add(Thread);
    }
}
