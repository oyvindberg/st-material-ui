package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<TableClassKey>> */
@js.native
trait PartialOverridesStyleRulesTableClassKey extends StObject {
  
  var root: js.UndefOr[CSSInterpolation] = js.native
  
  var stickyHeader: js.UndefOr[CSSInterpolation] = js.native
}
object PartialOverridesStyleRulesTableClassKey {
  
  @scala.inline
  def apply(): PartialOverridesStyleRulesTableClassKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesTableClassKey]
  }
  
  @scala.inline
  implicit class PartialOverridesStyleRulesTableClassKeyMutableBuilder[Self <: PartialOverridesStyleRulesTableClassKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setStickyHeader(value: CSSInterpolation): Self = StObject.set(x, "stickyHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyHeaderNull: Self = StObject.set(x, "stickyHeader", null)
    
    @scala.inline
    def setStickyHeaderUndefined: Self = StObject.set(x, "stickyHeader", js.undefined)
  }
}
