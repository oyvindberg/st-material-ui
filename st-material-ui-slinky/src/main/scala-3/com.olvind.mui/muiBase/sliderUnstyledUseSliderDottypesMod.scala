package com.olvind.mui.muiBase

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderUnstyledUseSliderDottypesMod {
  
  trait Mark extends StObject {
    
    var label: js.UndefOr[ReactElement] = js.undefined
    
    var value: Double
  }
  object Mark {
    
    inline def apply(value: Double): Mark = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mark] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
