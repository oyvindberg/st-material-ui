package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTabPanelMod {
  
  @js.native
  trait UseTabPanelProps extends StObject {
    
    /**
      * The value of the TabPanel. It will be shown when the Tab with the corresponding value is selected.
      */
    var value: Double | String = js.native
  }
  object UseTabPanelProps {
    
    @scala.inline
    def apply(value: Double | String): UseTabPanelProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseTabPanelProps]
    }
    
    @scala.inline
    implicit class UseTabPanelPropsMutableBuilder[Self <: UseTabPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
