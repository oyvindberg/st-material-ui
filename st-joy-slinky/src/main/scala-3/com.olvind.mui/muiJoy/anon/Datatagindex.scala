package com.olvind.mui.muiJoy.anon

import com.olvind.mui.react.mod.MouseEventHandler
import org.scalajs.dom.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datatagindex extends StObject {
  
  var `data-tag-index`: Double
  
  var disabled: Boolean
  
  var key: Double
  
  var onClick: MouseEventHandler[HTMLButtonElement]
  
  var tabIndex: -1
}
object Datatagindex {
  
  inline def apply(
    `data-tag-index`: Double,
    disabled: Boolean,
    key: Double,
    onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit
  ): Datatagindex = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), tabIndex = -1)
    __obj.updateDynamic("data-tag-index")(`data-tag-index`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datatagindex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Datatagindex] (val x: Self) extends AnyVal {
    
    inline def `setData-tag-index`(value: Double): Self = StObject.set(x, "data-tag-index", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setTabIndex(value: -1): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
