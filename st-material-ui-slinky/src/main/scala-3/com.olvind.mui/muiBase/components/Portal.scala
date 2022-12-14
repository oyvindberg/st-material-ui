package com.olvind.mui.muiBase.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.portalPortalDottypesMod.PortalProps
import com.olvind.mui.react.mod.RefAttributes
import org.scalajs.dom.Element
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @JSImport("@mui/base/Portal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Element] {
    
    inline def container(value: Element | (js.Function0[Element | Null])): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def containerFunction0(value: () => Element | Null): this.type = set("container", js.Any.fromFunction0(value))
    
    inline def containerNull: this.type = set("container", null)
    
    inline def disablePortal(value: Boolean): this.type = set("disablePortal", value.asInstanceOf[js.Any])
  }
  
  type Props = PortalProps & RefAttributes[Element]
  
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def styled: com.olvind.mui.StyledComponent.Builder[PortalProps & RefAttributes[Element], Builder] = new com.olvind.mui.StyledComponent.Builder[PortalProps & RefAttributes[Element], Builder](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: PortalProps & RefAttributes[Element]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
