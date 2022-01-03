package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<AlertTitleClassKey>> */
trait PartialOverridesStyleRulesAlertTitleClas extends StObject {
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesAlertTitleClas {
  
  inline def apply(): PartialOverridesStyleRulesAlertTitleClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesAlertTitleClas]
  }
  
  extension [Self <: PartialOverridesStyleRulesAlertTitleClas](x: Self) {
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
