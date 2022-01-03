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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/base.@mui/base/ClickAwayListener.ClickAwayListenerProps> */
@js.native
trait PartialClickAwayListenerProps extends StObject {
  
  var children: js.UndefOr[Element] = js.native
  
  var disableReactTree: js.UndefOr[Boolean] = js.native
  
  var mouseEvent: js.UndefOr[ClickAwayMouseEventHandler | `false`] = js.native
  
  var onClickAway: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  
  var touchEvent: js.UndefOr[ClickAwayTouchEventHandler | `false`] = js.native
}
object PartialClickAwayListenerProps {
  
  @scala.inline
  def apply(): PartialClickAwayListenerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClickAwayListenerProps]
  }
  
  @scala.inline
  implicit class PartialClickAwayListenerPropsMutableBuilder[Self <: PartialClickAwayListenerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDisableReactTree(value: Boolean): Self = StObject.set(x, "disableReactTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableReactTreeUndefined: Self = StObject.set(x, "disableReactTree", js.undefined)
    
    @scala.inline
    def setMouseEvent(value: ClickAwayMouseEventHandler | `false`): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEventUndefined: Self = StObject.set(x, "mouseEvent", js.undefined)
    
    @scala.inline
    def setOnClickAway(value: /* event */ MouseEvent => Callback): Self = StObject.set(x, "onClickAway", js.Any.fromFunction1((t0: /* event */ MouseEvent) => value(t0).runNow()))
    
    @scala.inline
    def setOnClickAwayUndefined: Self = StObject.set(x, "onClickAway", js.undefined)
    
    @scala.inline
    def setTouchEvent(value: ClickAwayTouchEventHandler | `false`): Self = StObject.set(x, "touchEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchEventUndefined: Self = StObject.set(x, "touchEvent", js.undefined)
  }
}
