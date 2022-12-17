package com.olvind.mui.react.components

import com.olvind.mui.react.mod.DetailedHTMLProps
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.StyledComponent.Builder
import org.scalajs.dom.HTMLHeadingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object h5 {
  
  type Props = DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
  
  val component: String = "h5"
  
  implicit def make(companion: h5.type): SharedBuilder_DetailedHTMLProps556941009[HTMLHeadingElement] = new SharedBuilder_DetailedHTMLProps556941009[HTMLHeadingElement](js.Array(this.component, js.Dictionary.empty))()
  
  def styled: Builder[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    SharedBuilder_DetailedHTMLProps556941009[HTMLHeadingElement]
  ] = new Builder[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    SharedBuilder_DetailedHTMLProps556941009[HTMLHeadingElement]
  ](this.component, new js.Object, js.Array(), (newComponent: Any) => new SharedBuilder_DetailedHTMLProps556941009[HTMLHeadingElement](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]): SharedBuilder_DetailedHTMLProps556941009[HTMLHeadingElement] = new SharedBuilder_DetailedHTMLProps556941009[HTMLHeadingElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
