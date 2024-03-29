package com.olvind.mui.muiBase.useListboxUseListboxDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionState extends StObject {
  
  var disabled: Boolean
  
  var highlighted: Boolean
  
  var index: Double
  
  var selected: Boolean
}
object OptionState {
  
  inline def apply(disabled: Boolean, highlighted: Boolean, index: Double, selected: Boolean): OptionState = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionState] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
