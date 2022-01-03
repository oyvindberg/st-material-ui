package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/StepContent/stepContentClasses.StepContentClasses> */
@js.native
trait PartialStepContentClasses extends StObject {
  
  var last: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var transition: js.UndefOr[String] = js.native
}
object PartialStepContentClasses {
  
  @scala.inline
  def apply(): PartialStepContentClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStepContentClasses]
  }
  
  @scala.inline
  implicit class PartialStepContentClassesMutableBuilder[Self <: PartialStepContentClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
