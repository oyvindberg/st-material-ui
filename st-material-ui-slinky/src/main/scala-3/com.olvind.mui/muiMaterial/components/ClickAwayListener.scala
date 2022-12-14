package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.clickAwayListenerClickAwayListenerMod.ClickAwayListenerProps
import com.olvind.mui.muiBase.clickAwayListenerClickAwayListenerMod.ClickAwayMouseEventHandler
import com.olvind.mui.muiBase.clickAwayListenerClickAwayListenerMod.ClickAwayTouchEventHandler
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClickAwayListener {
  
  inline def apply(onClickAway: MouseEvent | TouchEvent => Unit): Builder = {
    val __props = js.Dynamic.literal(onClickAway = js.Any.fromFunction1(onClickAway))
    new Builder(js.Array(this.component, __props.asInstanceOf[ClickAwayListenerProps]))
  }
  
  @JSImport("@mui/material/ClickAwayListener", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    inline def disableReactTree(value: Boolean): this.type = set("disableReactTree", value.asInstanceOf[js.Any])
    
    inline def mouseEvent(value: ClickAwayMouseEventHandler | false): this.type = set("mouseEvent", value.asInstanceOf[js.Any])
    
    inline def touchEvent(value: ClickAwayTouchEventHandler | false): this.type = set("touchEvent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClickAwayListenerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
