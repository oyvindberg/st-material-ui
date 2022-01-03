package com.olvind.mui.muiBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputRoot extends StObject {
  
  var input: js.UndefOr[ComponentPropsWithRefinput] = js.native
  
  var root: js.UndefOr[ComponentPropsWithRefdiv] = js.native
}
object InputRoot {
  
  @scala.inline
  def apply(): InputRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputRoot]
  }
  
  @scala.inline
  implicit class InputRootMutableBuilder[Self <: InputRoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: ComponentPropsWithRefinput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setRoot(value: ComponentPropsWithRefdiv): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
