
State1Command = {}

function State1Command:new()
	local command = {}

	function command:execute(event)
      Runtime:dispatchEvent({name="showState1"})
	end
  
	return command
end

return State1Command