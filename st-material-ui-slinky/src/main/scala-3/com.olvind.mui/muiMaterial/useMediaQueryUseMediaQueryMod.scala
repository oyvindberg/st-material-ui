package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Matches
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMediaQueryUseMediaQueryMod {
  
  @JSImport("@mui/material/useMediaQuery/useMediaQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Theme](queryInput: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(queryInput.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default[Theme](queryInput: String, options: UseMediaQueryOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(queryInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default[Theme](queryInput: js.Function1[/* theme */ Theme, String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(queryInput.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default[Theme](queryInput: js.Function1[/* theme */ Theme, String], options: UseMediaQueryOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(queryInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait MuiMediaQueryList extends StObject {
    
    def addListener(listener: MuiMediaQueryListListener): Unit
    
    var matches: Boolean
    
    def removeListener(listener: MuiMediaQueryListListener): Unit
  }
  object MuiMediaQueryList {
    
    inline def apply(
      addListener: MuiMediaQueryListListener => Unit,
      matches: Boolean,
      removeListener: MuiMediaQueryListListener => Unit
    ): MuiMediaQueryList = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), matches = matches.asInstanceOf[js.Any], removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[MuiMediaQueryList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MuiMediaQueryList] (val x: Self) extends AnyVal {
      
      inline def setAddListener(value: MuiMediaQueryListListener => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
      
      inline def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setRemoveListener(value: MuiMediaQueryListListener => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    }
  }
  
  trait MuiMediaQueryListEvent extends StObject {
    
    var matches: Boolean
  }
  object MuiMediaQueryListEvent {
    
    inline def apply(matches: Boolean): MuiMediaQueryListEvent = {
      val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[MuiMediaQueryListEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MuiMediaQueryListEvent] (val x: Self) extends AnyVal {
      
      inline def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    }
  }
  
  type MuiMediaQueryListListener = js.Function1[/* event */ MuiMediaQueryListEvent, Unit]
  
  trait UseMediaQueryOptions extends StObject {
    
    /**
      * As `window.matchMedia()` is unavailable on the server,
      * it returns a default matches during the first mount.
      * @default false
      */
    var defaultMatches: js.UndefOr[Boolean] = js.undefined
    
    /**
      * You can provide your own implementation of matchMedia.
      * This can be used for handling an iframe content window.
      */
    var matchMedia: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.matchMedia */ Any
      ] = js.undefined
    
    /**
      * To perform the server-side hydration, the hook needs to render twice.
      * A first time with `defaultMatches`, the value of the server, and a second time with the resolved value.
      * This double pass rendering cycle comes with a drawback: it's slower.
      * You can set this option to `true` if you use the returned value **only** client-side.
      * @default false
      */
    var noSsr: js.UndefOr[Boolean] = js.undefined
    
    /**
      * You can provide your own implementation of `matchMedia`, it's used when rendering server-side.
      */
    var ssrMatchMedia: js.UndefOr[js.Function1[/* query */ String, Matches]] = js.undefined
  }
  object UseMediaQueryOptions {
    
    inline def apply(): UseMediaQueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseMediaQueryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseMediaQueryOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaultMatches(value: Boolean): Self = StObject.set(x, "defaultMatches", value.asInstanceOf[js.Any])
      
      inline def setDefaultMatchesUndefined: Self = StObject.set(x, "defaultMatches", js.undefined)
      
      inline def setMatchMedia(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.matchMedia */ Any
      ): Self = StObject.set(x, "matchMedia", value.asInstanceOf[js.Any])
      
      inline def setMatchMediaUndefined: Self = StObject.set(x, "matchMedia", js.undefined)
      
      inline def setNoSsr(value: Boolean): Self = StObject.set(x, "noSsr", value.asInstanceOf[js.Any])
      
      inline def setNoSsrUndefined: Self = StObject.set(x, "noSsr", js.undefined)
      
      inline def setSsrMatchMedia(value: /* query */ String => Matches): Self = StObject.set(x, "ssrMatchMedia", js.Any.fromFunction1(value))
      
      inline def setSsrMatchMediaUndefined: Self = StObject.set(x, "ssrMatchMedia", js.undefined)
    }
  }
}
