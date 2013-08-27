viewA = {}

function viewA:new (parentGroup)
	local view = RNGroup:new()
  	view.classType = "viewA"

		function view:buttonstage2_touch(event)    
			Runtime:dispatchEvent({name="toState2"})
		end
		function view:buttonstage13_touch(event)    
			Runtime:dispatchEvent({name="toState3"})
		end
	

		function view:init()
					self.buttonstage2 = RNFactory.createButton ( 
						"./assets/images/button_off.png"
						, {
						imageOver = "/assets/images/button_over.png",
				  		imageDisabled = "/assets/images/button_disabled.png",
						onTouchDown = self.buttonstage2_touch,
						font = "./assets/fonts/arial.ttf",
						width = 200,
						height = 50,
						left = 50,
						top = 50
				 	})
					self.buttonstage13 = RNFactory.createButton ( 
						"./assets/images/button_off.png"
						, {
						imageOver = "/assets/images/button_over.png",
				  		imageDisabled = "/assets/images/button_disabled.png",
						onTouchDown = self.buttonstage13_touch,
						font = "./assets/fonts/arial.ttf",
						width = 200,
						height = 50,
						left = 50,
						top = 100
				 	})
			
			Runtime:dispatchEvent({name="onRobotlegsViewCreated", target=self})
		end

		function view:destroy()
			self.buttonstage2:remove()
			self.buttonstage13:remove()
			Runtime:dispatchEvent({name="onRobotlegsViewDestroyed", target=self})
			self:removeSelf()
		end

	view:init()
	return view
end
return viewA
