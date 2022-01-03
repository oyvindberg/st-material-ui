package com.olvind.mui.propTypes

import com.olvind.mui.std.Exclude
import com.olvind.mui.std.Partial
import com.olvind.mui.std.Pick
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type InferProps[V] = (InferPropsInner[Pick[V, RequiredKeys[V]]]) with (Partial[InferPropsInner[Pick[V, OptionalKeys[V]]]])
  
  type InferPropsInner[V] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: -? prop-types.prop-types.InferType<V[K]>}
    */ com.olvind.mui.propTypes.propTypesStrings.InferPropsInner with TopLevel[V]
  
  type OptionalKeys[V] = Exclude[/* keyof V */ String, RequiredKeys[V]]
  
  type RequiredKeys[V] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof V ]: -? std.Exclude<V[K], undefined> extends prop-types.prop-types.Validator<infer T>? prop-types.prop-types.IsOptional<any> extends true? never : K : never}[keyof V] */ js.Any
  
  type ValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? prop-types.prop-types.Validator<T[K]>}
    */ com.olvind.mui.propTypes.propTypesStrings.ValidationMap with TopLevel[T]
}
