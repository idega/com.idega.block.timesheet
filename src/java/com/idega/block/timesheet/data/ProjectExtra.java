package com.idega.block.timesheet.data;

import javax.ejb.*;

public interface ProjectExtra extends com.idega.data.IDOLegacyEntity
{
 public java.lang.String getDescription();
 public java.lang.String getFinances();
 public java.lang.String getGoals();
 public java.lang.String getIDColumnName();
 public java.lang.String getTasks();
 public void setDescription(java.lang.String p0);
 public void setFinances(java.lang.String p0);
 public void setGoals(java.lang.String p0);
 public void setTasks(java.lang.String p0);
}
