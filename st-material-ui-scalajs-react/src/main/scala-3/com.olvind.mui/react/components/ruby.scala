package com.olvind.mui.react.components

import com.olvind.mui.react.mod.DetailedHTMLProps
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.StyledComponent.Builder
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ruby {
  
  type Props = DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
  
  val component: String = "ruby"
  
  implicit def make(companion: ruby.type): SharedBuilder_DetailedHTMLProps_1024796696[HTMLElement] = new SharedBuilder_DetailedHTMLProps_1024796696[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def styled: Builder[
    DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], 
    SharedBuilder_DetailedHTMLProps_1024796696[HTMLElement]
  ] = new Builder[
    DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], 
    SharedBuilder_DetailedHTMLProps_1024796696[HTMLElement]
  ](this.component, new js.Object, js.Array(), (newComponent: Any) => new SharedBuilder_DetailedHTMLProps_1024796696[HTMLElement](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): SharedBuilder_DetailedHTMLProps_1024796696[HTMLElement] = new SharedBuilder_DetailedHTMLProps_1024796696[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
