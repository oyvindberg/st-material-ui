package com.olvind.mui.react.components

import com.olvind.mui.react.mod.DetailedHTMLProps
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.StyledComponent.Builder
import org.scalajs.dom.HTMLTableSectionElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tfoot {
  
  val component: String = "tfoot"
  
  implicit def make(companion: tfoot.type): SharedBuilder_DetailedHTMLProps778393028[HTMLTableSectionElement] = new SharedBuilder_DetailedHTMLProps778393028[HTMLTableSectionElement](js.Array(this.component, js.Dictionary.empty))()
  
  def styled: Builder[
    DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
    SharedBuilder_DetailedHTMLProps778393028[HTMLTableSectionElement]
  ] = new Builder[
    DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
    SharedBuilder_DetailedHTMLProps778393028[HTMLTableSectionElement]
  ](this.component, new js.Object, js.Array(), (newComponent: Any) => new SharedBuilder_DetailedHTMLProps778393028[HTMLTableSectionElement](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]): SharedBuilder_DetailedHTMLProps778393028[HTMLTableSectionElement] = new SharedBuilder_DetailedHTMLProps778393028[HTMLTableSectionElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
