package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<FormGroupClassKey>> */
@js.native
trait PartialOverridesStyleRulesFormGroupClass extends StObject {
  
  var root: js.UndefOr[CSSInterpolation] = js.native
  
  var row: js.UndefOr[CSSInterpolation] = js.native
}
object PartialOverridesStyleRulesFormGroupClass {
  
  @scala.inline
  def apply(): PartialOverridesStyleRulesFormGroupClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesFormGroupClass]
  }
  
  @scala.inline
  implicit class PartialOverridesStyleRulesFormGroupClassMutableBuilder[Self <: PartialOverridesStyleRulesFormGroupClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setRow(value: CSSInterpolation): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowNull: Self = StObject.set(x, "row", null)
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
