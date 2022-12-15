package com.olvind.mui.muiSystem.components

import com.olvind.mui.muiSystem.anon.DefaultComponentPropsGridTypeMapdiv
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableGrid {
  
  @JSImport("@mui/system/Unstable_Grid", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: UnstableGrid.type): SharedBuilder_DefaultComponentPropsGridTypeMapdiv_865969679[HTMLDivElement] = new SharedBuilder_DefaultComponentPropsGridTypeMapdiv_865969679[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* props */ DefaultComponentPropsGridTypeMapdiv): SharedBuilder_DefaultComponentPropsGridTypeMapdiv_865969679[HTMLDivElement] = new SharedBuilder_DefaultComponentPropsGridTypeMapdiv_865969679[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
