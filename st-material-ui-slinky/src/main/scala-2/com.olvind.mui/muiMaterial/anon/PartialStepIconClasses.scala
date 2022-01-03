package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/StepIcon/stepIconClasses.StepIconClasses> */
@js.native
trait PartialStepIconClasses extends StObject {
  
  var active: js.UndefOr[String] = js.native
  
  var completed: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object PartialStepIconClasses {
  
  @scala.inline
  def apply(): PartialStepIconClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStepIconClasses]
  }
  
  @scala.inline
  implicit class PartialStepIconClassesMutableBuilder[Self <: PartialStepIconClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
