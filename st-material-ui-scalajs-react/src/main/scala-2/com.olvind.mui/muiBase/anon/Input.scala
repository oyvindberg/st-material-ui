package com.olvind.mui.muiBase.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input extends StObject {
  
  var Input: js.UndefOr[ElementType] = js.native
  
  var Root: js.UndefOr[ElementType] = js.native
  
  var Textarea: js.UndefOr[ElementType] = js.native
}
object Input {
  
  @scala.inline
  def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: ElementType): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    @scala.inline
    def setRoot(value: ElementType): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    
    @scala.inline
    def setTextarea(value: ElementType): Self = StObject.set(x, "Textarea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextareaUndefined: Self = StObject.set(x, "Textarea", js.undefined)
  }
}
