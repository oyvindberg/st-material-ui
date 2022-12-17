package com.olvind.mui.muiStyledEngine.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiStyledEngine.styledEngineProviderStyledEngineProviderMod.StyledEngineProviderProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledEngineProvider {
  
  @JSImport("@mui/styled-engine", "StyledEngineProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    inline def injectFirst(value: Boolean): this.type = set("injectFirst", value.asInstanceOf[js.Any])
  }
  
  type Props = StyledEngineProviderProps
  
  implicit def make(companion: StyledEngineProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def styled: com.olvind.mui.StyledComponent.Builder[StyledEngineProviderProps, Builder] = new com.olvind.mui.StyledComponent.Builder[StyledEngineProviderProps, Builder](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: StyledEngineProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
