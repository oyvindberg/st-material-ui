package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<TableClassKey>> */
trait PartialOverridesStyleRulesTableClassKey extends StObject {
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
  
  var stickyHeader: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesTableClassKey {
  
  inline def apply(): PartialOverridesStyleRulesTableClassKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesTableClassKey]
  }
  
  extension [Self <: PartialOverridesStyleRulesTableClassKey](x: Self) {
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStickyHeader(value: CSSInterpolation): Self = StObject.set(x, "stickyHeader", value.asInstanceOf[js.Any])
    
    inline def setStickyHeaderNull: Self = StObject.set(x, "stickyHeader", null)
    
    inline def setStickyHeaderUndefined: Self = StObject.set(x, "stickyHeader", js.undefined)
  }
}
