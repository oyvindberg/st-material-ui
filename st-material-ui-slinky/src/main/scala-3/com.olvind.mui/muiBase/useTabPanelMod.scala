package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTabPanelMod {
  
  trait UseTabPanelProps extends StObject {
    
    /**
      * The value of the TabPanel. It will be shown when the Tab with the corresponding value is selected.
      */
    var value: Double | String
  }
  object UseTabPanelProps {
    
    inline def apply(value: Double | String): UseTabPanelProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseTabPanelProps]
    }
    
    extension [Self <: UseTabPanelProps](x: Self) {
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
