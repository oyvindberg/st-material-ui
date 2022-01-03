package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiBase.clickAwayListenerClickAwayListenerMod.ClickAwayMouseEventHandler
import com.olvind.mui.muiBase.clickAwayListenerClickAwayListenerMod.ClickAwayTouchEventHandler
import com.olvind.mui.muiMaterial.muiMaterialBooleans.`false`
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/base.@mui/base/ClickAwayListener.ClickAwayListenerProps> */
trait PartialClickAwayListenerProps extends StObject {
  
  var children: js.UndefOr[Element] = js.undefined
  
  var disableReactTree: js.UndefOr[Boolean] = js.undefined
  
  var mouseEvent: js.UndefOr[ClickAwayMouseEventHandler | `false`] = js.undefined
  
  var onClickAway: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  
  var touchEvent: js.UndefOr[ClickAwayTouchEventHandler | `false`] = js.undefined
}
object PartialClickAwayListenerProps {
  
  inline def apply(): PartialClickAwayListenerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClickAwayListenerProps]
  }
  
  extension [Self <: PartialClickAwayListenerProps](x: Self) {
    
    inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisableReactTree(value: Boolean): Self = StObject.set(x, "disableReactTree", value.asInstanceOf[js.Any])
    
    inline def setDisableReactTreeUndefined: Self = StObject.set(x, "disableReactTree", js.undefined)
    
    inline def setMouseEvent(value: ClickAwayMouseEventHandler | `false`): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
    
    inline def setMouseEventUndefined: Self = StObject.set(x, "mouseEvent", js.undefined)
    
    inline def setOnClickAway(value: /* event */ MouseEvent => Callback): Self = StObject.set(x, "onClickAway", js.Any.fromFunction1((t0: /* event */ MouseEvent) => value(t0).runNow()))
    
    inline def setOnClickAwayUndefined: Self = StObject.set(x, "onClickAway", js.undefined)
    
    inline def setTouchEvent(value: ClickAwayTouchEventHandler | `false`): Self = StObject.set(x, "touchEvent", value.asInstanceOf[js.Any])
    
    inline def setTouchEventUndefined: Self = StObject.set(x, "touchEvent", js.undefined)
  }
}
