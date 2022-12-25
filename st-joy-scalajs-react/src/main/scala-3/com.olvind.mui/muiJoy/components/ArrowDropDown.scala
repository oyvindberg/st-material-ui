package com.olvind.mui.muiJoy.components

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsSvgIconTypeMapsvg
import com.olvind.mui.StyledComponent.Builder
import org.scalajs.dom.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArrowDropDown {
  
  @JSImport("@mui/joy/internal/svg-icons/ArrowDropDown", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = /* props */ DefaultComponentPropsSvgIconTypeMapsvg
  
  implicit def make(companion: ArrowDropDown.type): SharedBuilder_DefaultComponentPropsSvgIconTypeMapsvg715442404[SVGSVGElement] = new SharedBuilder_DefaultComponentPropsSvgIconTypeMapsvg715442404[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
  
  def styled: Builder[
    /* props */ DefaultComponentPropsSvgIconTypeMapsvg, 
    SharedBuilder_DefaultComponentPropsSvgIconTypeMapsvg715442404[SVGSVGElement]
  ] = new Builder[
    /* props */ DefaultComponentPropsSvgIconTypeMapsvg, 
    SharedBuilder_DefaultComponentPropsSvgIconTypeMapsvg715442404[SVGSVGElement]
  ](this.component, new js.Object, js.Array(), (newComponent: Any) => new SharedBuilder_DefaultComponentPropsSvgIconTypeMapsvg715442404[SVGSVGElement](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: /* props */ DefaultComponentPropsSvgIconTypeMapsvg): SharedBuilder_DefaultComponentPropsSvgIconTypeMapsvg715442404[SVGSVGElement] = new SharedBuilder_DefaultComponentPropsSvgIconTypeMapsvg715442404[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
