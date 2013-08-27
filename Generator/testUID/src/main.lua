require("config")
require("rapanui-sdk.rapanui")
require("eventHandler")
Runtime = eventHandler:new()

local function startThisMug()
  RNMainThread.removeAction(actionId)
	local function bootstrap()
		require "application"
		local app = application:new()

		function showProps(o)
			for key,value in pairs(o) do
				print("key: ", key, ", value: ", value);
			end
			print("-- end showProps --")
		end
	end

	bootstrap()
end	

actionId = RNMainThread.addTimedAction(0.5, startThisMug)
