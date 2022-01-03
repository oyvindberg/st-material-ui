package com.olvind.mui.muiBase.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.portalPortalMod.PortalProps
import org.scalajs.dom.Element
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @JSImport("@mui/base", "Portal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def container(value: Element | (js.Function0[Element | Null])): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerFunction0(value: () => Element | Null): this.type = set("container", js.Any.fromFunction0(value))
    
    @scala.inline
    def containerNull: this.type = set("container", null)
    
    @scala.inline
    def disablePortal(value: Boolean): this.type = set("disablePortal", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
