package com.olvind.mui.muiIconsMaterial.components

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsSvgIconTypeMapsvg
import com.olvind.mui.StyledComponent.Builder
import org.scalajs.dom.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Leaderboard {
  
  @JSImport("@mui/icons-material/Leaderboard", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Leaderboard.type): SharedBuilder_DefaultComponentPropsSvgIconTypeMapsvg1028217032[SVGSVGElement] = new SharedBuilder_DefaultComponentPropsSvgIconTypeMapsvg1028217032[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
  
  def styled: Builder[
    DefaultComponentPropsSvgIconTypeMapsvg, 
    SharedBuilder_DefaultComponentPropsSvgIconTypeMapsvg1028217032[SVGSVGElement]
  ] = new Builder[
    DefaultComponentPropsSvgIconTypeMapsvg, 
    SharedBuilder_DefaultComponentPropsSvgIconTypeMapsvg1028217032[SVGSVGElement]
  ](this.component, new js.Object, js.Array(), (newComponent: Any) => new SharedBuilder_DefaultComponentPropsSvgIconTypeMapsvg1028217032[SVGSVGElement](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: DefaultComponentPropsSvgIconTypeMapsvg): SharedBuilder_DefaultComponentPropsSvgIconTypeMapsvg1028217032[SVGSVGElement] = new SharedBuilder_DefaultComponentPropsSvgIconTypeMapsvg1028217032[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
