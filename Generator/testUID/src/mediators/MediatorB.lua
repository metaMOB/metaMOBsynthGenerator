MediatorB = {}

function MediatorB:new ()
	local mediator = {}

		function mediator:onRegister()
			local view = self.viewInstance
			Runtime:addEventListener("eventTouchButtonB", self)
		end
		function mediator:onRemove()
			local view = self.viewInstance
			Runtime:removeEventListener("eventTouchButtonB", self)
		end
   		function mediator:eventTouchButtonB(event)  
   			Runtime:dispatchEvent({name="commandTouchButtonB"}) 
   		end
   	
  	return mediator
end

return MediatorB
