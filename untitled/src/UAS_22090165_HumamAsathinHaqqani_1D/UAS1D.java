package UAS_22090165_HumamAsathinHaqqani_1D;

import java.util.ArrayList;

public class UAS1D {
    private String MessageID;
    private String MessageName;
    private ArrayList<String> Context;

    public String getMessageID() {
        return MessageID;
    }

    public void setMessageID(String messageID) {
        MessageID = messageID;
    }
    public String getMessageName() {
        return MessageName;
    }

    public void setMessageName(String messageName) {
        MessageName = messageName;
    }

    public ArrayList<String> getContext() {
        return Context;
    }
    public void setContext(ArrayList<String> context) {
        Context = context;
    }

    public int FindWords(ArrayList<String> context, String cari) {
        int indexKata = context.indexOf(cari);
        return indexKata;
    }
}
