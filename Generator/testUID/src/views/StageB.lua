StageB = {}

function StageB:new (parentGroup)
	local view = RNGroup:new()
  	view.classType = "StageB"

		function view:buttonb_eventtouchb(event)    
			Runtime:dispatchEvent({name="eventTouchButtonB"})
		end
	

		function view:init()
					self.buttonb = RNFactory.createButton ( 
						"./assets/images/button_off.png"
						, {
						imageOver = "/assets/images/button_over.png",
				  		imageDisabled = "/assets/images/button_disabled.png",
						onTouchDown = self.buttonb_eventtouchb,
						font = "./assets/fonts/arial.ttf",
						width = 200,
						height = 50,
						left = 100,
						top = 100
				 	})
			
			Runtime:dispatchEvent({name="onRobotlegsViewCreated", target=self})
		end

		function view:destroy()
			self.buttonb:remove()
			Runtime:dispatchEvent({name="onRobotlegsViewDestroyed", target=self})
			self:removeSelf()
		end

	view:init()
	return view
end
return StageB
