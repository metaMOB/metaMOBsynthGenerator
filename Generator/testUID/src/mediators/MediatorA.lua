MediatorA = {}

function MediatorA:new ()
	local mediator = {}

		function mediator:onRegister()
			local view = self.viewInstance
			Runtime:addEventListener("eventTouchButtonA", self)
		end
		function mediator:onRemove()
			local view = self.viewInstance
			Runtime:removeEventListener("eventTouchButtonA", self)
		end
   		function mediator:eventTouchButtonA(event)  
   			Runtime:dispatchEvent({name="commandTouchButtonA"}) 
   		end
   	
  	return mediator
end

return MediatorA
