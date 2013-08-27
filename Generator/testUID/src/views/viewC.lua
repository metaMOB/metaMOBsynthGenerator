viewC = {}

function viewC:new (parentGroup)
	local view = RNGroup:new()
  	view.classType = "viewC"

		function view:buttonstage31_touch(event)    
			Runtime:dispatchEvent({name="toState1"})
		end
	

		function view:init()
					self.buttonstage31 = RNFactory.createButton ( 
						"./assets/images/button_off.png"
						, {
						imageOver = "/assets/images/button_over.png",
				  		imageDisabled = "/assets/images/button_disabled.png",
						onTouchDown = self.buttonstage31_touch,
						font = "./assets/fonts/arial.ttf",
						width = 200,
						height = 50,
						left = 0,
						top = 0
				 	})
			
			Runtime:dispatchEvent({name="onRobotlegsViewCreated", target=self})
		end

		function view:destroy()
			self.buttonstage31:remove()
			Runtime:dispatchEvent({name="onRobotlegsViewDestroyed", target=self})
			self:removeSelf()
		end

	view:init()
	return view
end
return viewC
