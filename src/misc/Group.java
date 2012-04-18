/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.util.List;

/**
 *
 * @author dxtr
 */
public class Group {
    private byte[] icon;
    private String name;
    private List<Group> subgroups;
    private List<Entry> entries;
    
    public Group(String newName) { name = newName; }
    
    public byte[] getIcon() { return icon; }
    public String getName() { return name; }
    public List<Group> getSubGroups() { return subgroups; }
    public List<Entry> getEntries() { return entries; }
    
    public void setIcon(byte[] newIcon) { icon = newIcon; }
    public void setName(String newName) { name = newName; }
    public void setSubGroups(List<Group> newSubGroups) { subgroups = newSubGroups; }
    public void setEntries(List<Entry> newEntries) { entries = newEntries; }
    public void addSubGroup(Group newSubGroup) { subgroups.add(newSubGroup); }
    public void addSubGroups(List<Group> newSubGroups) {
        for (Group sg : newSubGroups) { subgroups.add(sg); }
    }
    public void addEntry(Entry newEntry) { entries.add(newEntry); }
    public void addEntries(List<Entry> newEntries) {
        for (Entry ne : newEntries) { entries.add(ne); }
    }
}