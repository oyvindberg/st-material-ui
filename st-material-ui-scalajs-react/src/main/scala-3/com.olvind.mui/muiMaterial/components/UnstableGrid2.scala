package com.olvind.mui.muiMaterial.components

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsGrid2TypeMapdiv
import com.olvind.mui.StyledComponent.Builder
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableGrid2 {
  
  @JSImport("@mui/material/Unstable_Grid2", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = /* props */ DefaultComponentPropsGrid2TypeMapdiv
  
  implicit def make(companion: UnstableGrid2.type): SharedBuilder_DefaultComponentPropsGrid2TypeMapdiv715375132[HTMLDivElement] = new SharedBuilder_DefaultComponentPropsGrid2TypeMapdiv715375132[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def styled: Builder[
    /* props */ DefaultComponentPropsGrid2TypeMapdiv, 
    SharedBuilder_DefaultComponentPropsGrid2TypeMapdiv715375132[HTMLDivElement]
  ] = new Builder[
    /* props */ DefaultComponentPropsGrid2TypeMapdiv, 
    SharedBuilder_DefaultComponentPropsGrid2TypeMapdiv715375132[HTMLDivElement]
  ](this.component, new js.Object, js.Array(), (newComponent: Any) => new SharedBuilder_DefaultComponentPropsGrid2TypeMapdiv715375132[HTMLDivElement](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: /* props */ DefaultComponentPropsGrid2TypeMapdiv): SharedBuilder_DefaultComponentPropsGrid2TypeMapdiv715375132[HTMLDivElement] = new SharedBuilder_DefaultComponentPropsGrid2TypeMapdiv715375132[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
