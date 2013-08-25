
State2Command = {}

function State2Command:new()
	local command = {}

	function command:execute(event)    
      print ("########################################################")
      Runtime:dispatchEvent({name="showState2"})
	end
  
	return command
end

return State2Command