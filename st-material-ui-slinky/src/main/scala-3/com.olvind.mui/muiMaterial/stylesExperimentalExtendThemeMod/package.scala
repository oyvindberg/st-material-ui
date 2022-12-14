package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import com.olvind.mui.muiMaterial.anon.OmitThemepaletteCssVarsTheme
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default(options: CssVarsThemeOptions, args: js.Object*): OmitThemepaletteCssVarsTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[OmitThemepaletteCssVarsTheme]
inline def default(options: Unit, args: js.Object*): OmitThemepaletteCssVarsTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[OmitThemepaletteCssVarsTheme]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.Record<string | number, infer V> ? keyof T extends string | number ? V extends string | number ? keyof T : keyof V extends string | number ? / * template literal string: ${keyofT}-${ConcatDeep<Split<V>>} * / string : never : never : never
  }}}
  */
type ConcatDeep[T] = /* keyof T */ String

type DefaultColorScheme = "light" | "dark"

type ExtendedColorScheme = scala.Nothing

/**
  * Does not work for these cases:
  * - { borderRadius: string | number } // the value can't be a union
  * - { shadows: [string, string, ..., string] } // the value can't be an array
  */
type NormalizeVars[T] = ConcatDeep[Split[T, /* keyof T */ String]]

type Overlays = js.Array[Any]

type SupportedColorScheme = DefaultColorScheme | ExtendedColorScheme

type ThemeCssVar = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 52, starting with `com.olvind.mui`.muiMaterial.stylesExperimentalExtendThemeMod.NormalizeVars[`com.olvind.mui`.muiMaterial.anon.OmitThemeVarsoverlaysshadowsshape], "shape-borderRadius", "shadows-0" */ Any
