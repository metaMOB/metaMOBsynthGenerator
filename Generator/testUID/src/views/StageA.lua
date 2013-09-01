StageA = {}

function StageA:new (parentGroup)
	local view = RNGroup:new()
  	view.classType = "StageA"

		function view:buttona_eventtoucha(event)    
			Runtime:dispatchEvent({name="eventTouchButtonA"})
		end
	

		function view:init()
					self.buttona = RNFactory.createButton ( 
						"./assets/images/button_off.png"
						, {
						imageOver = "/assets/images/button_over.png",
				  		imageDisabled = "/assets/images/button_disabled.png",
						onTouchDown = self.buttona_eventtoucha,
						font = "./assets/fonts/arial.ttf",
						width = 200,
						height = 50,
						left = 100,
						top = 200
				 	})
			
			Runtime:dispatchEvent({name="onRobotlegsViewCreated", target=self})
		end

		function view:destroy()
			self.buttona:remove()
			Runtime:dispatchEvent({name="onRobotlegsViewDestroyed", target=self})
			self:removeSelf()
		end

	view:init()
	return view
end
return StageA
