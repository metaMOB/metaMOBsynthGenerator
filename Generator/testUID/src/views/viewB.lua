viewB = {}

function viewB:new (parentGroup)
	local view = RNGroup:new()
  	view.classType = "viewB"

		function view:buttonstage1_touch(event)    
			Runtime:dispatchEvent({name="toState1"})
		end
	

		function view:init()
					self.buttonstage1 = RNFactory.createButton ( 
						"./assets/images/button_off.png"
						, {
						imageOver = "/assets/images/button_over.png",
				  		imageDisabled = "/assets/images/button_disabled.png",
						onTouchDown = self.buttonstage1_touch,
						font = "./assets/fonts/arial.ttf",
						width = 200,
						height = 50,
						left = 150,
						top = 50
				 	})
			
			Runtime:dispatchEvent({name="onRobotlegsViewCreated", target=self})
		end

		function view:destroy()
			self.buttonstage1:remove()
			Runtime:dispatchEvent({name="onRobotlegsViewDestroyed", target=self})
			self:removeSelf()
		end

	view:init()
	return view
end
return viewB
