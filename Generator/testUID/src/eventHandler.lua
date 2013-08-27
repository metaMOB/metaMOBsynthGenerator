eventHandler = {}
eventHandler.__index = eventHandler

function eventHandler:new()
   local res = {}
   res.events = {}
	setmetatable(res, self)
	return res
end

function eventHandler:addEventListener(eventName, callback)
  print ("addEventListener ", eventName, "  ", callback)
  local tbl = self.events[eventName] or {}   
  table.insert(tbl, callback)      
  self.events[eventName] = tbl  
  --self:print()
end

function eventHandler:removeEventListener(eventName, Object)
  print ("removeEventListener ", eventName, "  ", Object)
  local tbl = self.events[eventName] or {} 
  for val = 1, #tbl do --actualcode
    if tbl[val] == Object then
      table.remove(tbl, val)
     end
  end
  --table.remove(tbl, Object)     
  if #tbl == 0 then
    self.events[eventName] = nil
  else
      self.events[eventName] = tbl
  end  
end

function eventHandler:dispatchEvent(dataTable)
  print ("dispatch do", dataTable.name)
  local tbl = self.events[dataTable.name] or {}  
  dataTableB = dataTable
  tmpTbl = {}
  for key,value in pairs(dataTable) do
    
  end
  
  for val = 1, #tbl do --actualcode
    print ("hier ",tbl[val], type(tbl[val]))
    
    if type(tbl[val]) == "table" then
      
    x = tbl[val]
    print ("table", x,tbl[val] , dataTable.target)
    --local y = 
    --x:name(dataTable)
    z = loadstring ("x:"..dataTable.name.."(dataTableB)")
    z()
    --x:onRobotlegsViewCreated(dataTable)
    print ("jup ", y, dataTable.name, type(dataTable))
    else
     print ("function ",dataTable)
     x = tbl[val]
     x(dataTable)
    end
  end
   
end

function eventHandler:print()
    for key,value in pairs(self.events) do --actualcode
      print ("Event ", key)
      print ("values: ")
      local tbl = value
      for val = 1, #tbl do --actualcode
        print (value[val])
      end       
    end
end

return eventHandler