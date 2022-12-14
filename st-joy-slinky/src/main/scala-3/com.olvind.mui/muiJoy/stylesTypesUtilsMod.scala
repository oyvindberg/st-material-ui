package com.olvind.mui.muiJoy

import com.olvind.mui.std.Exclude
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesTypesUtilsMod {
  
  type FilterConditionally[T, U] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends U? K : never}[keyof T] */ js.Any
  
  @js.native
  trait MergeDefault[T, U] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ k in @mui/joy.@mui/joy/styles/types/utils.OverridableStringUnion<keyof DefaultRecord, Overrides> ]: k extends keyof DefaultRecord? DefaultRecord[k] : any}
    }}}
    */
  @js.native
  trait OverridableImplicitRecord[DefaultRecord /* <: Record[String, Any] */, Overrides] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ k in @mui/joy.@mui/joy/styles/types/utils.OverridableStringUnion<keyof DefaultRecord, Overrides> ]: Value}
    }}}
    */
  @js.native
  trait OverridableRecord[DefaultRecord /* <: Record[String, Any] */, Overrides, Value] extends StObject
  
  type OverridableStringUnion[T /* <: String | Double | js.Symbol */, U] = (FilterConditionally[U, true]) | (Exclude[T, FilterConditionally[U, false]])
}
