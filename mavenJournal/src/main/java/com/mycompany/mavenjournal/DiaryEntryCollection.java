/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenjournal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;

/**
 *
 * @author Stiv
 */
public class DiaryEntryCollection extends Observable {

    /**
     * @return the currentEntry
     */
    
    public DiaryEntryCollection()
    {
        listDiaryEntries = new ArrayList<DiaryEntry>();
    }
    
    public int getCurrentEntryIndex() {
        return currentEntryIndex;
    }
    
    public DiaryEntry getCurrentDiaryEntry()
    {
        if (currentEntryIndex>=0 && currentEntryIndex<listDiaryEntries.size())
        return listDiaryEntries.get(currentEntryIndex);
        return null;
    }
    
    public void goNext()
    {
        if (currentEntryIndex<getSize()-1) setCurrentEntryIndex(currentEntryIndex+1);
    }
    
    public void goPrev()
    {
        if (currentEntryIndex>0) setCurrentEntryIndex(currentEntryIndex-1);
    }

    /**
     * @param currentEntryIndex the currentEntry to set
     */
    public void setCurrentEntryIndex(int currentEntryIndex) {
        if (currentEntryIndex>=0 && currentEntryIndex<listDiaryEntries.size())
        this.currentEntryIndex = currentEntryIndex;
        setChanged();
        notifyObservers(getCurrentDiaryEntry());
    }

    private int currentEntryIndex = -1;
    ArrayList<DiaryEntry> listDiaryEntries;
    
    
    public boolean addEntry(String title, String bodyText)
    {
        if (title.equals("") || bodyText.equals("")) return false;
        listDiaryEntries.add(new DiaryEntry(title,bodyText));
        currentEntryIndex = getSize()-1;
        setChanged();
        notifyObservers(getCurrentDiaryEntry());        
        return true;
    }
    
    public int getSize()
    {
        return listDiaryEntries.size();
    }
    
    public void deleteEntry()
    {
        if(currentEntryIndex >= 0){
            listDiaryEntries.remove(currentEntryIndex);
            setChanged();
            notifyObservers(getCurrentDiaryEntry());
        }
    }

    boolean deleteEntry(String title, String bodyText) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
