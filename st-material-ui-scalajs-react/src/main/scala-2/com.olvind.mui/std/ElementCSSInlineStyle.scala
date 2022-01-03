package com.olvind.mui.std

import org.scalajs.dom.CSSStyleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementCSSInlineStyle extends StObject {
  
  /* standard dom */
  val style: CSSStyleDeclaration = js.native
}
object ElementCSSInlineStyle {
  
  @scala.inline
  def apply(style: CSSStyleDeclaration): ElementCSSInlineStyle = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCSSInlineStyle]
  }
  
  @scala.inline
  implicit class ElementCSSInlineStyleMutableBuilder[Self <: ElementCSSInlineStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: CSSStyleDeclaration): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
