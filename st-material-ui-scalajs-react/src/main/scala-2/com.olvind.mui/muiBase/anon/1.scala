package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.buttonUnstyledPropsMod.ButtonUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.ButtonHTMLAttributes
import org.scalajs.dom.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var root: js.UndefOr[
    ButtonHTMLAttributes[HTMLButtonElement] with ButtonUnstyledComponentsPropsOverrides
  ] = js.native
}
object `1` {
  
  @scala.inline
  def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: ButtonHTMLAttributes[HTMLButtonElement] with ButtonUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
