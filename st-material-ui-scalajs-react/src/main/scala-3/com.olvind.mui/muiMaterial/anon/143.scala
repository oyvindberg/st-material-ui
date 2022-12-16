package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.tableSortLabelTableSortLabelClassesMod.TableSortLabelClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `143`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableSortLabelPropsdefaultCompone] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[TableSortLabelClassKey, "MuiTableSortLabel", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTableSortLabelPropsdefaultCompone]] = js.undefined
}
object `143` {
  
  inline def apply[Theme](): `143`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`143`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `143`[?], Theme] (val x: Self & `143`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialTableSortLabelPropsdefaultCompone): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[TableSortLabelClassKey, "MuiTableSortLabel", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTableSortLabelPropsdefaultCompone]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTableSortLabelPropsdefaultCompone*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
