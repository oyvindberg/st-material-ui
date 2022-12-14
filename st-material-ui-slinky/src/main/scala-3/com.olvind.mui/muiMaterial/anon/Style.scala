package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style[C] extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var ref: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: C extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
  ] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object Style {
  
  inline def apply[C](): Style[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style[C]]
  }
  
  extension [Self <: Style[?], C](x: Self & Style[C]) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setRef(
      value: /* import warning: importer.ImportType#apply Failed type conversion: C extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
    ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
